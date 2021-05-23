import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaResenaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 1300px; height: 100%; border: #ccc solid 2px; border-radius : 5px; align-items: center;">
 <vaadin-horizontal-layout style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);">
   <p style="margin-left: var(--lumo-space-xl);">Usuario: </p>
   <vaadin-text-field id="nombreText" style="align-self: center;" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end; margin-right: var(--lumo-space-xl);">
   <p>Valoracion:</p>
   <vaadin-text-field id="valoracionText" style="align-self: center; margin-right: var(--lumo-space-xl);" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 100%; width: 100%; margin: var(--lumo-space-m); padding: var(--lumo-space-m);">
  <vaadin-text-area id="contenidoText" style="height: 100%; width: 100%; margin-right: var(--lumo-space-l);" readonly></vaadin-text-area>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-resena-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaResenaProducto.is, VistaResenaProducto);
