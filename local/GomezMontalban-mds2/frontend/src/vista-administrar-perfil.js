import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrar-perfil`
 *
 * VistaAdministrarPerfil element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarPerfil extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-administrar-perfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarPerfil.is, VistaAdministrarPerfil);
