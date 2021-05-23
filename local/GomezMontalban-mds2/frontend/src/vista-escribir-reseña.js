import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <h1 style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">Escribir una reseña</h1>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">
   <p>Valoracion</p>
   <vaadin-horizontal-layout theme="spacing" id="selectLayout"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-text-area style="width: 90%; height: 90%; align-self: center;" id="cuerpoText"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);">
  <vaadin-button theme="primary error" style="margin-right: var(--lumo-space-xl);" id="cancelarButton">
    Cancelar 
  </vaadin-button>
  <vaadin-button theme="primary" style="margin-left: var(--lumo-space-xl);" id="publicarButton">
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
