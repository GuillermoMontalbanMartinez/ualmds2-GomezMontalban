import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrar-categorias`
 *
 * VistaAdministrarCategorias element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarCategorias extends PolymerElement {

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
        return 'vista-administrar-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarCategorias.is, VistaAdministrarCategorias);
