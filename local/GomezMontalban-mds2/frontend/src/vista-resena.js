import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaReseña extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;" id="verticalLayoutResena">
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 40%; height: 100%;">
   <vaadin-vertical-layout style="width: 100%;">
    <vaadin-horizontal-layout style="width: 100%;">
     <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
      <label style="margin: var(--lumo-space-m);">Valoración media</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
      <vaadin-text-field style="margin: var(--lumo-space-m);" readonly id="textValorarionMedia"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 60%; height: 100%;">
   <vaadin-text-area style="width: 100%;" readonly id="textDescripcionResena"></vaadin-text-area>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-resena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaResena.is, VistaResena);
