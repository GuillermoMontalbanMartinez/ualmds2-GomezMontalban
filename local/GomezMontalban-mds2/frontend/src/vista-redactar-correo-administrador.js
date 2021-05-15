import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRedactarCorreoAdministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayoutRedactarCorreoAdministrador">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <h1 style="margin: var(--lumo-space-m); align-self: center;">Redactar correo</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
    <label style="margin: var(--lumo-space-m);">Destinatario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; flex-shrink: 0; align-self: center;">
    <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" id="textDestinatario"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center;">
    <label style="flex-shrink: 0; align-self: center; margin-right: var(--lumo-space-s);">Asunto</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-text-field style="flex-shrink: 0; align-self: center; margin-left: var(--lumo-space-xl);" id="textAsunto"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center; height: 100%; width: 60%;">
  <vaadin-text-area style="width: 100%; height: 100%;" id="textCuerpo"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-button style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" id="vaadinButtonCancelar" theme="primary error">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="vaadinButtonAceptar" theme="primary ">
      Aceptar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-redactar-correo-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRedactarCorreoAdministrador.is, VistaRedactarCorreoAdministrador);
