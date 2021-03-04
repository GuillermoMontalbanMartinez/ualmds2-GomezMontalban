import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEscribirReseña extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <h1 style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">Heading 1</h1>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">
   <p>Valoracion</p>
   <vaadin-select value="Item one" style="align-self: center;">
    <template>
     <vaadin-list-box selected="0">
      <vaadin-item selected>
       0
      </vaadin-item>
      <vaadin-item>
       1
      </vaadin-item>
      <vaadin-item>
       2
      </vaadin-item>
      <vaadin-item>
       3
      </vaadin-item>
      <vaadin-item>
       4
      </vaadin-item>
      <vaadin-item>
       5
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
  </vaadin-horizontal-layout>
  <vaadin-text-area style="width: 90%; height: 90%; align-self: center;"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);">
  <vaadin-button theme="primary error" style="margin-right: var(--lumo-space-xl);">
   Cancelar
  </vaadin-button>
  <vaadin-button theme="primary" style="margin-left: var(--lumo-space-xl);">
   Publicar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-escribir-reseña';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEscribirReseña.is, VistaEscribirReseña);
